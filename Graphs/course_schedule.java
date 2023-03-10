class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(numCourses==0){
            return true;
        }
        int[] course=new int[numCourses];
        for(int i=0;i<prerequisites.length;i++){
            course[prerequisites[i][1]]++;
        }
        boolean[] visited=new boolean[prerequisites.length];
        boolean flag=true;
        while(flag){
            flag=false;
            for(int i=0;i<prerequisites.length;i++){
                if(!visited[i]){
                    if(course[prerequisites[i][0]]==0){
                        visited[i]=true;
                        course[prerequisites[i][1]]--;
                        flag=true;
                    }
                }
            }
        }
        for(int i=0;i<numCourses;i++){
            if(course[i]!=0){
                return false;
            }
        }
        return true;                             
    }
}
