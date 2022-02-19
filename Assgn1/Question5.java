class Message{
    private String data;  
    synchronized void writeData(String str){
        this.data = str;
    }
    synchronized void readData(){
        System.out.println(data);
    }
}  

class Writer extends Thread{  
      Message t;  
      Writer(Message t){  
          this.t=t;  
        }  

    public void run(){  
      t.writeData("Akshitha Anil");  
    }  
}

class Reader extends Thread{  
      Message t;  
      Reader(Message t){  
          this.t=t;  
      }

     public void run(){  
     t.readData();  
    }  
}  
  
public class Question5{  
      public static void main(String args[]){  
      Message obj = new Message(); 
      Writer w=new Writer(obj);  
      Reader r=new Reader(obj);  
      w.start();  
      r.start();  
      }  
}  
