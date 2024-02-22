#include <iostream>
#include <math.h>
using namespace std;

class calci
{
    float a, b;
    char d;

public:
    float cal();
    float rectangle();
    float circle();
    void process();
    calci();
    ~calci();
};
float calci::cal()
{
    cout << "Enter your operation" << endl;
    cin >> a >> d >> b;
    switch (d)
    {
    case ('+'):
    {
        cout << a << "+" << b << "=" << a + b;
        break;
    }
    case ('-'):
    {
        cout << a << "-" << b << "=" << a - b;
        break;
    }
    case ('*'):
    {
        cout << a << "*" << b << "=" << a * b;
        break;
    }
    case ('X'):
    {
        cout << a << "X" << b << "=" << a * b;
        break;
    }
    case ('/'):
    {
        cout << a << "/" << b << "=" << a / b;
        break;
    }
    default:
    {
        cout << "Invalid operartion.";
    }
    }
}
float calci::rectangle()
{
    cout << "Enter length and breadth" << endl;
    cin >> a >> b;
    cout << "Area of the rectangle is " << a * b;
}
float calci::circle()
{
    // float pi = 3.14;
    cout << "Enter radius of the circle " << endl;
    cin >> a;
    cout << "Area of the circle is " << M_PI * a * a;
}
void calci::process()
{
    cout << "Choose an option: " << endl;
    cout << "C --> Calculate the area of a circle" << endl;
    cout << "R --> Calculate the area of a rectagle" << endl;
    cout << "M --> Perform algebraic operations" << endl;
    cout << "Q --> Quit" << endl;
    while ((d = getchar()) != 'Q')
    {
        switch (d)
        {
        case 'C':
        {
            circle();
            break;
        }
        case 'c':
        {
            circle();
            break;
        }
        case 'R':
        {
            rectangle();
            break;
        }
        case 'r':
        {
            rectangle();
            break;
        }
        case 'M':
        {
            cal();
            break;
        }
        case 'm':
        {
            cal();
            break;
        }
        default:
        {
            cout << endl;
        }
        }
    }
}
calci::calci()
{
}
calci::~calci()
{
    cout << "Task failed successfully";
}

int main()
{
    calci x;
    x.process();
    return 0;
}