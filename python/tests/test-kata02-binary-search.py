from .context import code_kata

import unittest


class BasicTestSuite(unittest.TestCase):
    """Basic test cases."""

    def test_empty_array(self):
        self.assertEqual(-1, code_kata.chop(3, []))

    def test_single(self):
        self.assertEqual(-1, code_kata.chop(3, [1]))
        self.assertEqual(0, code_kata.chop(1, [1]))

    def test_3_items(self):
        self.assertEqual(0, code_kata.chop(1, [1, 3, 5]))
        self.assertEqual(1, code_kata.chop(2, [1, 3, 5]))
        self.assertEqual(2, code_kata.chop(3, [1, 3, 5]))
        self.assertEqual(-1, code_kata.chop(0, [1, 3, 5]))
        self.assertEqual(-1, code_kata.chop(2, [1, 3, 5]))
        self.assertEqual(-1, code_kata.chop(4, [1, 3, 5]))
        self.assertEqual(-1, code_kata.chop(6, [1, 3, 5]))


if __name__ == '__main__':
    unittest.main()
