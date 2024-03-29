#include <iostream>
using namespace std;

template<class T> class Manipulator {
    T obj;
public:
    Manipulator(T t) { obj = x; }
    void manipulate() { obj.f(); }
};

class HasF {
public:
    void f() {cout << "HasF :: f()" << endl; }
};

int main() {
    HasF hf;
    Manipulator<HasF> manipulator(hf);
    manipulator.manipulate();
}

