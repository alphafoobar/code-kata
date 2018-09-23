#include <time.h> // Import string format time.

// Build representation of now for logging.
struct tm* now() {
    time_t timer;
    time(&timer);
    return localtime(&timer);
}