class BrowserHistory {
    String currentPage;
    Stack<String> history;
    Stack<String> visited;

    public BrowserHistory(String homepage) {
        this.currentPage = homepage;
        this.history = new Stack<>();
        this.visited = new Stack<>();

        history.push(currentPage);
    }
    
    public void visit(String url) {
        currentPage = url;
        history.push(url);
        visited.clear();
    }
    
    public String back(int steps) {
        // String curr = "";
        while(steps > 0 && history.size()>1){
            visited.push(history.pop());
            currentPage = history.peek();
            steps--;
        }
        return currentPage;
    }
    
    public String forward(int steps) {
        while(steps > 0 && !visited.empty()){
            history.push(visited.pop());
            steps--;
        }
        return history.peek();
        
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */