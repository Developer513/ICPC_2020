import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

//DFS
class Dfs_graph{
    private int vertexNum;
    private int edgeNum;
    private ArrayList<ArrayList<Integer>> dfs;
    private boolean[] visitArr;
    //set vortex num
    public Dfs_graph(int vortexnum, int edgeNum){
        this.vertexNum = vortexnum;
        this.edgeNum = edgeNum;
        this.dfs = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<this.vertexNum+1;i++){
            this.dfs.add(new ArrayList<Integer>());//리스트 노드 하나에 리스트를 추가 
        }
        this.visitArr = new boolean[this.vertexNum+1];
    }
    //return graph
    public ArrayList<ArrayList<Integer>> getGraph(){
        return this.dfs;
    }
    //return Node input index 
    public ArrayList<Integer> getNode(int i){
        return this.dfs.get(i);
    }
    //양방향 간선추가
    public void put_Node(int x,int y){
        this.dfs.get(x).add(y);// 바깥리스트 x인덱스에 y값 삽입 
        this.dfs.get(y).add(x);
    }// y노드에 x 값 삽입
    //단방향 간선추가
    public void putSingle(int x, int y){
        this.dfs.get(x).add(y);
    }

    public void printGraph(){
        for(int i=1;i<this.dfs.size();i++){
            System.out.print("정점 " + i + "의 인접리스트");            
            for(int j=0;j<this.dfs.get(i).size();j++){
                System.out.print(" -> " + this.dfs.get(i).get(j));
            }
        }
    }
    //노드방문확인 배열 초기화 
    public void initialize_Visit_Arr(){
        for(int i=0;i<this.visitArr.length;i++){
            this.visitArr[i] = false;
        }
    }
    //노드의 인덱스를 매개변수로 받는다. 
    public void dfs_search(int vertexIndex){
        this.visitArr[vertexIndex] = true;
        System.out.print(vertexIndex + " "); 
        this.dfs.get(vertexIndex).sort(Comparator.naturalOrder());
        for(int i : this.dfs.get(vertexIndex)){ //i=리스트의 해당 인덱스 부터 끝까지 반복DFS
            if(this.visitArr[i] == false){
                dfs_search(i);
            }
        }
    }
}
//BFS
class Bfs_graph{
    private int vertexNum;
    private int edgeNum;
    private ArrayList<ArrayList<Integer>> bfs;
    private ArrayList<Integer> sortedvertex;
//    private Queue<Integer>visitnode;
    private boolean[] visitArr;
    //set vortex num
    public Bfs_graph(int vortexnum, int edgeNum){
        this.vertexNum = vortexnum;
        this.edgeNum = edgeNum;
        this.bfs = new ArrayList<ArrayList<Integer>>();
        this.sortedvertex = new ArrayList<Integer>();
  //      this.visitnode = new LinkedList<Integer>();
        for(int i=0;i<this.vertexNum+1;i++){
            this.bfs.add(new ArrayList<Integer>());//리스트 노드 하나에 리스트를 추가 
        }
        this.visitArr = new boolean[this.vertexNum+1];
    }
    //return graph
    public ArrayList<ArrayList<Integer>> getGraph(){
        return this.bfs;
    }
    //return Node input index 
    public ArrayList<Integer> getNode(int i){
        return this.bfs.get(i);
    }
    //양방향 간선추가
    public void put_Node(int x,int y){
        this.bfs.get(x).add(y);// 바깥리스트 x인덱스에 y값 삽입 
        this.bfs.get(y).add(x);
    }// y노드에 x 값 삽입
    //단방향 간선추가
    public void putSingle(int x, int y){
        this.bfs.get(x).add(y);
    }

    public void printGraph(){
        for(int i=1;i<this.bfs.size();i++){
            System.out.print("정점 " + i + "의 인접리스트");            
            for(int j=0;j<this.bfs.get(i).size();j++){
                System.out.print(" -> " + this.bfs.get(i).get(j));
            }
        }
    }
    //노드방문확인 배열 초기화 
    public void initialize_Visit_Arr(){
        for(int i=0;i<this.visitArr.length;i++){
            this.visitArr[i] = false;
        }
    }
    //노드의 인덱스를 매개변수로 받는다. 
    public void bfs_search(int vertexIndex){
        Queue<Integer>visitnode = new LinkedList<Integer>();
        HashMap<Integer, Boolean> hash = new HashMap<Integer, Boolean>();
        //this.visitArr[vertexIndex] = true;
        visitnode.offer(vertexIndex);
        while(!visitnode.isEmpty()){
            int q = visitnode.poll();
            visitArr[q] = true;
            System.out.print(q + " ");     
            this.bfs.get(q).sort(Comparator.naturalOrder());
            for(int i : this.bfs.get(q)){
                if(visitArr[i] == false && !hash.containsKey(i)){
                    visitnode.offer(i)
                    hash.put(i,true);
                }
            }
        }
    }
        /*
        //for(int i=vertexIndex;i<this.bfs.size();i++){//3,4,5
            for(int j=0;j<this.bfs.get(vertexIndex).size();j++){//인접행렬의 크기만큼 반복 
                this.sortedvertex.add(this.bfs.get(vertexIndex).get(j));
                visitnode.offer(this.bfs.get(vertexIndex).get(j));//큐에다가 다 넣음 
                
            }
            this.sortedvertex.sort(Comparator.naturalOrder());
            //오름차순 정렬 
            for(int k=0;k<this.sortedvertex.size();k++){
                if()//안겹치는 노드를 탐색하는 방법 
            }
        }
    //}
    */
}

public class Graph_search{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer str;
        String inputinfo = br.readLine();
        StringTokenizer info = new StringTokenizer(inputinfo," ");
        int vertexNum = Integer.parseInt(info.nextToken());
        int edgeNum = Integer.parseInt(info.nextToken());
        int initNodeIdx = Integer.parseInt(info.nextToken());
        Dfs_graph dfs = new Dfs_graph(vertexNum, edgeNum);
        Bfs_graph bfs = new Bfs_graph(vertexNum, edgeNum);
        for(int i=0;i<edgeNum;i++){
            String inputnum = br.readLine();
            str = new StringTokenizer(inputnum," ");
            int vtxnum = Integer.parseInt(str.nextToken());
            int edgnum = Integer.parseInt(str.nextToken());
            dfs.put_Node(vtxnum,edgnum);
            bfs.put_Node(vtxnum,edgnum);
        }
        dfs.initialize_Visit_Arr();
        dfs.dfs_search(initNodeIdx);
        System.out.println();
        bfs.bfs_search(initNodeIdx);
    }
}