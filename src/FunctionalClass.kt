class FunctionalClass(myInterface: MyInterface) {
    private var myInterface: MyInterface = myInterface
    fun doMath(x : Int, y : Int){
        if(x!=y){
            myInterface.onSuccess("Success")
        }
        if(x==x){
            myInterface.onFail("Fail")
        }
    }
}