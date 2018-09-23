//
// Tests for kata02 - Karate Chop!
//
#include <stdio.h> // for printf & sprintf.
#include <stdlib.h> // for malloc.
#include <string.h> // for strcmp.
#include <time.h> // for string format time.
#include <stdbool.h> // for boolean type.
#include <math.h> // for log10.
#include "kata02-binary-search.h"
#include "now.h"
#include "log.h"

int calc_chars(int number) {
    if (number < 10) {
        // Numbers may be negative.
        return 2;
    }
    return (int) log10(number) + 2;
}

char *build_failure_message(int expected, int actual) {
    char *failure_message = (char *) malloc(calc_chars(abs(expected)) + 25 + calc_chars(abs(actual)) * sizeof(char));
    sprintf(failure_message, "Wanted %d but received %d", expected, actual);
    return failure_message;
}

int expect_eq(char title[], int expected, int actual) {
    char *string = expected == actual ? "OK" : build_failure_message(expected, actual);

    print_log(title, string);

    int compare = strcmp("OK", string);

    // Time to tidy!
    free(string);
    return compare == 0 ? 0 : -1;
}

int test_empty_array() {
    int array[] = {};
    return expect_eq("empty array", -1, chop(3, array));
}

int test_array_of_length_1() {
    int array[] = {1};
    return expect_eq("length of 1", -1, chop(3, array))
           + expect_eq("length of 1", 0, chop(1, array));
}

int test_array_of_length_3() {
    int array[] = {1, 3, 5};
    return expect_eq("length of 3", 0, chop(1, array))
           + expect_eq("length of 3", 1, chop(3, array))
           + expect_eq("length of 3", 2, chop(5, array))
           + expect_eq("length of 3", -1, chop(0, array))
           + expect_eq("length of 3", -1, chop(2, array))
           + expect_eq("length of 3", -1, chop(4, array))
           + expect_eq("length of 3", -1, chop(6, array));
}

int test_array_of_length_4() {
    int array[] = {1, 3, 5, 7};
    return expect_eq("length of 4", 0, chop(1, array))
           + expect_eq("length of 4", 1, chop(3, array))
           + expect_eq("length of 4", 2, chop(5, array))
           + expect_eq("length of 4", 3, chop(7, array))
           + expect_eq("length of 4", -1, chop(0, array))
           + expect_eq("length of 4", -1, chop(2, array))
           + expect_eq("length of 4", -1, chop(4, array))
           + expect_eq("length of 4", -1, chop(6, array))
           + expect_eq("length of 4", -1, chop(8, array));
}

int main() {
    char result[26];
    strftime(result, 26, "%Y-%m-%d %H:%M:%S", now());
    int test_result = test_empty_array()
                      + test_array_of_length_1()
                      + test_array_of_length_3()
                      + test_array_of_length_4();
    printf("[%s] (test) Finished%s\n", result, test_result == 0 ? "." : " with errors!");
    return 0;
}
