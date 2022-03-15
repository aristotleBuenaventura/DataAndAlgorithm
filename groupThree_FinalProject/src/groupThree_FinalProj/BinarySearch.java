package groupThree_FinalProj;

/* 
 * BinarySearch
 * 
 * This class is used to implement the Binary Tree in the Payroll_JFrame class. 
 * It has methods for creating, updating, and searching.
 * 
 */


import javax.swing.JOptionPane;


/* Class containing left
and right child, string*/
class node 
{
    node left;
    node right;
    String name;
    String ID;
    String field;

    public node(String name, String ID, String field) {
        left = null;
        right = null;
        this.name = name;
        this.ID = ID;
        this.field = field;
    }
}

class BinaryTree {
    public static node root;
    String name;
    String ID;
    String field;

    BinaryTree() {
        root = null;
    }

//create method 
    public void create(Object namePayroll, Object IDPayroll, Object fieldPayroll)
    {
        int flag = 0;
        node ptr, any;
   
    	name = (String) namePayroll;
    	ID = (String) IDPayroll;
        any = root;
            while (any != null) {
                if (any.ID.compareTo(ID) == 0) {
                    flag = 1;
                    break;
                }
                if ((any.ID).compareTo(ID) > 0) {
                    any = any.left;
                } else {
                    any = any.right;
                }
        }
    	field = (String) fieldPayroll;
    	node temp = new node(name, ID, field);
        if (root == null) {
            root = temp;
        }
        else {
            ptr = root;
            while (flag == 0) {
                if ((temp.name).compareTo(ptr.name) > 0) {
                    if (ptr.right != null) {
                        ptr = ptr.right;
                    } else {
                        ptr.right = temp;
                        flag = 1;
                    }
                }
                if ((temp.name).compareTo(ptr.name) < 0) {
                    if (ptr.left != null) {
                        ptr = ptr.left;
                    } else {
                        ptr.left = temp;
                        flag = 1;
                    }
                }
            }
        }
    }
//update method
    public void update(String updateName, String updateID, String updateField) {
        int flag = 0;
        node ptr;
        String key = updateName;
        ptr = root;
        while (ptr != null) {
            if ((ptr.name).compareTo(key) == 0) {
                flag = 1;
                break;
            }
            if ((ptr.name).compareTo(key) > 0) {
                ptr = ptr.left;
            } else {
                ptr = ptr.right;
            }
        }
        if (flag == 1) {
            String newID;
            newID = updateID;
            ptr.ID = newID;
            
            ptr.field = updateField;
            
        }

    }
//search method 
    public void search(String searchPayroll) {
        int flag = 0;
        node ptr;
        String key = searchPayroll;
        ptr = root;
         while (ptr != null)
         {
            if (ptr.name.toLowerCase().compareTo(key) == 0) {
                flag = 1;
             
                SearchWindow search = new SearchWindow();
                search.setVisible(true);
                
                search.SearchWindow(ptr.name,ptr.ID,ptr.field);

                break;
            }
            if ((ptr.name).toLowerCase().compareTo(key) > 0) {
                ptr = ptr.left;
            } else {
                ptr = ptr.right;
            }
        }
        if (flag == 0) {
            JOptionPane.showMessageDialog( null, "-----RECORD NOT FOUND-----","3MBC Payroll System", JOptionPane.ERROR_MESSAGE);
            
        }
    }
}

