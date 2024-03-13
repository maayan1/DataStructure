package LeetCode.Graph;
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;

//public class CourseSchedule {
/*
    public boolean canFinish(int numCourses, int [][] prerequisites ){
        //create an adjacency list to represent the graph
        List<List<Integer>> adjList = new ArrayList<>(numCourses);


        for (int i = 0; i < numCourses; i++){
            adjList.add(new ArrayList<>());
        }
        //count the indegree  of each course
        int [] indegree  = new int[numCourses];
        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            int prereq = prerequisite[1];
            adjList.get(prereq).add(course);
            indegree[course]++;
        }

        //create a queue to perform topological sorting
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++){
            if (indegree[i] == 0){
                queue.offer(i);
            }
        }
        // Perform topological sorting
        while (!queue.isEmpty()) {
            int course = queue.poll();
            numCourses--;

            for (int neighbor : adjList.get(course)) {
                if (--indegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        // If we finished all courses, return true; otherwise, return false
        return numCourses == 0;
    }
    public static void main(String[] args) {
        CourseSchedule courseSchedule = new CourseSchedule();
        int numCourses = 4;
        int[][] prerequisites = {{1, 0}, {2, 1}, {3, 2}, {1, 3}};

        int numCourses1 = 2;
        int[][] prerequisites1 = {{1,0}, {0, 1}};
        boolean canFinish = courseSchedule.canFinish(numCourses1, prerequisites1);
        System.out.println("Can finish all courses: " + canFinish);
    }

}*/
