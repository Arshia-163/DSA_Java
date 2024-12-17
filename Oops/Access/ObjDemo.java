package pack.oops.Access;

public class ObjDemo {
    int num;

public ObjDemo(int num){
this.num = num;
}

// gives a unique number representation of an object
    @Override
    public int hashCode() {
        
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {

        return super.equals(obj);
    }

    @Override
    public String toString() {
//already covered prev.
        return super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
    
        return super.clone();
    }

    public static void main(String[] args) {
        ObjDemo obj = new ObjDemo(43);
        ObjDemo obj2 = new ObjDemo(43);

if(obj == obj2){
    //it checks the address is same i.e where it is stored
    System.out.println("obj is equal to obj2");
}
if(obj.equals(obj2)){
    //it checks the content for it
    System.out.println("obj is equal to obj2");
}


System.out.println(obj2.getClass());
        //System.out.println(obj.hashCode());
        // will generate a random int value
    }
}
