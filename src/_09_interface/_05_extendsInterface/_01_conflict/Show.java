package _09_interface._05_extendsInterface._01_conflict;

/**
 * @Author wx-li
 * @Date 2019/8/27 15:21
 **/
interface I1{void f();}
interface I2{int f(int i);}
interface I3{int f();}
class C {public int f(){return 1;}}

class C2 implements I1,I2{
    public void f() {

    }

    public int f(int i) {   //overloaded
        return 1;
    }
}

class C3 extends C implements I2 {  //overloaded
    public int f(int i) {
        return 1;
    }
}

class C4 extends C implements I3 {
    //Identical,no problem:
    public int f(){return 1;}
}

//Methods differ only by return type:
//!class C5 extends C implements I1 {
//
//}
//!interface I4 extends I1,I3{}

/*
    其实本质就是：不能用返回值类型要作为重载的依据，因为：
    int f(){}
    void f(){}
    f();    //不知道调用的是哪一个!
    所以打算组合的不同接口中使用相同的方法名通常会造成代码可读性的混乱，请尽量避免这种情况
 */