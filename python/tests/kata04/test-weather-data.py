from .context import kata04

import unittest


class WeatherDataTestSuite(unittest.TestCase):
    """Basic test cases for Kata 04 - Data Munging."""

    def test_no_data(self):
        self.assertEqual(0, kata04.smallest_difference([]))


if __name__ == '__main__':
    unittest.main()
