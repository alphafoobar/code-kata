defmodule Kata02_BinarySearchTest do
  use ExUnit.Case
  doctest Kata02_BinarySearch

  test "empty list" do
    assert Kata02_BinarySearch.chop(1, []) == -1
  end

  test "list of one" do
    assert Kata02_BinarySearch.chop(1, [1]) == 0
    assert Kata02_BinarySearch.chop(3, [1]) == -1
  end

  test "list of three" do
    assert Kata02_BinarySearch.chop(1, [1, 3, 5]) == 0
    assert Kata02_BinarySearch.chop(3, [1, 3, 5]) == 1
    assert Kata02_BinarySearch.chop(5, [1, 3, 5]) == 2
    assert Kata02_BinarySearch.chop(0, [1, 3, 5]) == -1
    assert Kata02_BinarySearch.chop(2, [1, 3, 5]) == -1
    assert Kata02_BinarySearch.chop(4, [1, 3, 5]) == -1
    assert Kata02_BinarySearch.chop(6, [1, 3, 5]) == -1
  end

  test "list of four" do
    assert Kata02_BinarySearch.chop(1, [1, 3, 5, 7]) == 0
    assert Kata02_BinarySearch.chop(3, [1, 3, 5, 7]) == 1
    assert Kata02_BinarySearch.chop(5, [1, 3, 5, 7]) == 2
    assert Kata02_BinarySearch.chop(7, [1, 3, 5, 7]) == 3
    assert Kata02_BinarySearch.chop(0, [1, 3, 5, 7]) == -1
    assert Kata02_BinarySearch.chop(2, [1, 3, 5, 7]) == -1
    assert Kata02_BinarySearch.chop(4, [1, 3, 5, 7]) == -1
    assert Kata02_BinarySearch.chop(6, [1, 3, 5, 7]) == -1
    assert Kata02_BinarySearch.chop(8, [1, 3, 5, 7]) == -1
  end
end
