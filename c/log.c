#include <stdio.h> // For printf.
#include <time.h> // For strftime.
#include "now.h" // For now.

void print_log(char *test_name, char *message) {
    char result[26];
    strftime(result, 26, "%Y-%m-%d %H:%M:%S", now());
    printf("[%s] (%s) %s\n", result, test_name, message);
}