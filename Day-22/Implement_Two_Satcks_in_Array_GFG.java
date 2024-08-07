class twoStacks {
    private ArrayList<ArrayList<Integer>> stacks = new ArrayList<>();
    twoStacks() {
        ArrayList<Integer> s1 = new ArrayList<>();
        ArrayList<Integer> s2 = new ArrayList<>();
        
        stacks.add(s1);
        stacks.add(s2);
    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        stacks.get(0).add(x);
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        stacks.get(1).add(x);
    }

    // Function to remove an element from top of the stack1.
    int pop1() {
        if(stacks.get(0).size()==0)
            return -1;
        return stacks.get(0).remove(stacks.get(0).size()-1);
    }

    // Function to remove an element from top of the stack2.
    int pop2() {
        if (stacks.get(1).size()==0)
            return -1;
        return stacks.get(1).remove(stacks.get(1).size()-1);
    }
}
