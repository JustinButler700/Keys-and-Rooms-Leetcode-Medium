class Solution {
    boolean[] visited; // array representing all rooms
    int visitedRooms = 0; // Variable which holds the number of unique rooms we have visited
    public boolean canVisitAllRooms(List < List < Integer >> rooms) {
        visited = new boolean[rooms.size()]; // init array
        visit(0, rooms); // dfs
        return visitedRooms == rooms.size();
    }
    public void visit(int index, List < List < Integer >> rooms) {
        if (visited[index]) {
            return;
        }
        visited[index] = true;
        visitedRooms++;
        for (int j = 0; j < rooms.get(index).size(); j++) {
            int key = rooms.get(index).get(j);
            if (key != index && !visited[key]) {
                visit(key, rooms);
            }
        }
        return;
    }
}
