cmake_minimum_required(VERSION 3.12)
project(cpp)

set(CMAKE_CXX_STANDARD 17)

if (APPLE)
    add_definitions(-DGTEST_USE_OWN_TR1_TUPLE)
    add_definitions(-D__GLIBCXX__)
endif (APPLE)

add_library(cpp src/kata02_binary_search.cpp src/kata02_binary_search.h)

add_subdirectory(test)