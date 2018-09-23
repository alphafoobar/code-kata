from .context import code_kata

import unittest


class Kata02TestSuite(unittest.TestCase):
    """Basic test cases for Kata 02 - the karate chop."""

    def test_empty_array(self):
        self.assertEqual(-1, code_kata.chop(3, []))

    def test_single(self):
        self.assertEqual(-1, code_kata.chop(3, [1]))
        self.assertEqual(0, code_kata.chop(1, [1]))

    def test_3_items(self):
        self.assertEqual(0, code_kata.chop(1, [1, 3, 5]))
        self.assertEqual(1, code_kata.chop(3, [1, 3, 5]))
        self.assertEqual(2, code_kata.chop(5, [1, 3, 5]))
        self.assertEqual(-1, code_kata.chop(0, [1, 3, 5]))
        self.assertEqual(-1, code_kata.chop(2, [1, 3, 5]))
        self.assertEqual(-1, code_kata.chop(4, [1, 3, 5]))
        self.assertEqual(-1, code_kata.chop(6, [1, 3, 5]))

    def test_4_items(self):
        self.assertEqual(0, code_kata.chop(1, [1, 3, 5, 7]))
        self.assertEqual(1, code_kata.chop(3, [1, 3, 5, 7]))
        self.assertEqual(2, code_kata.chop(5, [1, 3, 5, 7]))
        self.assertEqual(3, code_kata.chop(7, [1, 3, 5, 7]))
        self.assertEqual(-1, code_kata.chop(0, [1, 3, 5, 7]))
        self.assertEqual(-1, code_kata.chop(2, [1, 3, 5, 7]))
        self.assertEqual(-1, code_kata.chop(4, [1, 3, 5, 7]))
        self.assertEqual(-1, code_kata.chop(6, [1, 3, 5, 7]))
        self.assertEqual(-1, code_kata.chop(8, [1, 3, 5, 7]))


if __name__ == '__main__':
    unittest.main()
