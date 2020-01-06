public class tree {
    int value;
    tree left;
    tree right;
    tree root;

    tree(int value)
    {
        this.value=value;
        right=null;
        left=null;
        root=null;
    }
    public tree insert(tree current,int value)
    {
        if(current==null) {
            return new tree(value);
        }
        if(value<current.value)
        {
            current.left=insert(current.left,value);
        }
        else if(value>current.value)
        {
            current.right=insert(current.right,value);
        }
        else
        {
            return current;
        }
        return current;

    }
    public void add(int value)
    {
        root=insert(root ,value);
    }
    public void traverse(tree t)
    {
        if (t!=null)
        {
            traverse(t.left);
            traverse(t.root);
            System.out.println(t.value);
        }
    }

    public static void main(String[] args) {
        int val=5;
        tree t=new tree(val);
        for(int i=1; i<6; i++)
        {
            t.add(i);
        }
        for(int i=1; i<6; i++) {
            t.traverse(t);
        }

    }
}
