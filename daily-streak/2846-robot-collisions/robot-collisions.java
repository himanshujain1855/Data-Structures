class Solution {
    public static List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int len=positions.length;
        Integer[] actualIndices=new Integer[len];
        for (int i = 0; i < len; i++) {
            actualIndices[i]=i;
        }
        Arrays.sort(
                actualIndices,
                (n2, n1) -> Integer.compare(positions[n2], positions[n1])
        );
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Boolean> stackToHashMap=new HashMap<>();
        Stack<Integer> positionsStack = new Stack<>();
        positionsStack.push(actualIndices[0]);
        stackToHashMap.put(actualIndices[0],true);

        for (int i = 1; i < len; i++) {
            char dir = directions.charAt(actualIndices[i]);
            if (!positionsStack.isEmpty() && 'R' == directions.charAt(positionsStack.peek()) && dir == 'L') {
                while (true) {
                    char lastPushedDirection = directions.charAt(positionsStack.peek());

                    if (directions.charAt(actualIndices[i]) == lastPushedDirection) {
                        stackToHashMap.put(actualIndices[i],true);
                        positionsStack.push(actualIndices[i]);
                        break;
                    }

                    int peekWhile = positionsStack.peek();
                    int healthPeekWhile = healths[peekWhile];
                    int positionsIHealth = healths[actualIndices[i]];

                    if (healthPeekWhile == positionsIHealth) {
                        stackToHashMap.remove(positionsStack.pop());
                        break;
                    } else if (healthPeekWhile > positionsIHealth) {
                        healths[peekWhile]--;
                        break;
                    } else {
                        stackToHashMap.remove(positionsStack.pop());
                        healths[actualIndices[i]]--;
                        if (positionsStack.isEmpty()) {
                            positionsStack.push(actualIndices[i]);
                            stackToHashMap.put(actualIndices[i],true);
                            break;
                        }
                    }
                }
            } else {
                positionsStack.push(actualIndices[i]);
                stackToHashMap.put(actualIndices[i],true);
            }
        }

        for (int i = 0; i < len; i++) {
            if (stackToHashMap.containsKey(i)) {
                ans.add(healths[i]);
            }
        }
        return ans;
    }

    // Function for linear search
    public static int search(int arr[], int x) {
        int n = arr.length;

        // Traverse array arr[]
        for (int i = 0; i < n; i++) {

            // If element found then
            // return that index
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
}