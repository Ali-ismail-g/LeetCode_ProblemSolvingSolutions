class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> sandwichStack = new Stack<>();
        Queue<Integer> studentQueue = new ArrayDeque<>();
        for(int i=sandwiches.length - 1;i>=0;i--){
            sandwichStack.push(sandwiches[i]);
        }
        for(int i=students.length - 1;i>=0;i--){
            studentQueue.offer(students[i]);
        }
        int studentWithNoSandwich=0;
        while(studentWithNoSandwich < sandwichStack.size()&&!studentQueue.isEmpty()){
            if(sandwichStack.peek() == studentQueue.peek()){
                studentQueue.poll();
                sandwichStack.pop();
                studentWithNoSandwich = 0;
            }else{
                studentWithNoSandwich++;
                studentQueue.offer(studentQueue.poll());
            }
        }
        return studentQueue.size();
    }
}