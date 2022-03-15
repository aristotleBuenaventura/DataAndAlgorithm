package Assignment5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Employees {
    int index;
    String name; //Employee Name
    String position; //Employee Position 
    LinkedList<Employees> connectedEmployees = new LinkedList<>();

    public Employees(int i, String name, String position) {
        index = i;
        this.name = name;
        this.position = position;
    }
}

public class Graph {
	
    int size =0;
    
    List<Employees> company = new ArrayList<>();

    void addEmployee(String code, String name){
        int i = size++;
        Employees employee = new Employees(i,name, code);
        company.add(employee);
    }

    Employees companyLookup(String code){
        for(Employees c:company){
            if(c.position.equalsIgnoreCase(code)){
                return c;
            }
        }
        return null;
    }

    void connectEmp(String code1, String code2){
        Employees c1 = companyLookup(code1);
        Employees c2 = companyLookup(code2);
        if( c1 == null || c2 == null){
            System.out.println("Cannot connect, Invalid Company position.");
            return;
        }
        c1.connectedEmployees.add(c2);
    }

    public void findBFSpath(String position) {
        boolean[] visited = new boolean[size];
        Employees employee = companyLookup(position);
        System.out.println();
        System.out.println(" Meet the people who made this project possible: ");
        System.out.println();
        LinkedList<Employees> bfs = new LinkedList<>();
        bfs.add(employee);
        visited[employee.index] = true;

        while(!bfs.isEmpty()){
            Employees currentElement = bfs.poll();
            System.out.print(" >> "+ currentElement.name);


            for(Employees curr : currentElement.connectedEmployees){
                if(!visited[curr.index]){
                    visited[curr.index] = true;
                    bfs.add(curr);
                }
            }


        }

    }

    public void findDFSpath(String position) {
        boolean[] visited = new boolean[size];
        Employees employee = companyLookup(position);
        System.out.println();
        System.out.println(" Meet the people who made this project possible");
        System.out.println();
        DFS(employee, visited);
    }

    public void DFS(Employees company, boolean[] visited) {
        visited[company.index] = true;
        
        for(Employees c :company.connectedEmployees){
            if(!visited[c.index]){
                DFS(c,visited);
            }
        }
        System.out.print("\n " + company.name);
    }

}
