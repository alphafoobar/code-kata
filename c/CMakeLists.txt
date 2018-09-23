cmake_minimum_required(VERSION 3.12)
project(c)

set(CMAKE_CXX_STANDARD 14)

add_executable(code_kata kata02-binary-search.c kata02-binary-search_test.c now.c log.c)
