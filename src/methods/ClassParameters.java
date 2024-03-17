package methods;

 public class ClassParameters {int a=100;
public static void main(String[] args){


ClassParameters  classParameters = new ClassParameters(10);
classParameters.method();
}
public int method(){
System.out.println("FROM METHOD"+a);

return 0;

}
public ClassParameters(int a){
this.a=a;
System.out.println(" FROM CONSTRUCTOR "+a);


}

}
