
public class BSTFactory{

    public BSTBalance<String, String> factory(int opcion){
        switch(opcion){

            case 1:
                return new RBT<String, String>();
            
            case 2:
                return new SplayTree<String, String>();
            
            default:
                return new RBT<String, String>();
        }
    }
}