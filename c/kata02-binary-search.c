#include <limits.h> // Import INT_MIN.

int chop(int key, int array[]) {
    // No exceptions in C, -1 usually used to define unknown. But we want all tests to fail so using INT_MIN instead.
    return INT_MIN;
}