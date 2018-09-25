using NUnit.Framework;

namespace Kata02_BinarySearch.Test
{
    [TestFixture]
    public class BinarySearchTests
    {
        private BinarySearch _binarySearch = new BinarySearch();

        [Test]
        public void TestEmpty()
        {
            Assert.Equals(-1, _binarySearch.Chop(3, new int[] { }));
        }

        [Test]
        public void TestSingle()
        {
            Assert.Equals(-1, _binarySearch.Chop(3, new[] {1}));
            Assert.Equals(0, _binarySearch.Chop(1, new[] {1}));
        }

        [Test]
        public void TestTriple()
        {
            Assert.Equals(0, _binarySearch.Chop(1, new[] {1, 3, 5}));
            Assert.Equals(1, _binarySearch.Chop(3, new[] {1, 3, 5}));
            Assert.Equals(2, _binarySearch.Chop(5, new[] {1, 3, 5}));
            Assert.Equals(-1, _binarySearch.Chop(0, new[] {1, 3, 5}));
            Assert.Equals(-1, _binarySearch.Chop(2, new[] {1, 3, 5}));
            Assert.Equals(-1, _binarySearch.Chop(4, new[] {1, 3, 5}));
            Assert.Equals(-1, _binarySearch.Chop(6, new[] {1, 3, 5}));
        }

        [Test]
        public void TestQuadriple()
        {
            Assert.Equals(0, _binarySearch.Chop(1, new[] {1, 3, 5, 7}));
            Assert.Equals(1, _binarySearch.Chop(3, new[] {1, 3, 5, 7}));
            Assert.Equals(2, _binarySearch.Chop(5, new[] {1, 3, 5, 7}));
            Assert.Equals(3, _binarySearch.Chop(7, new[] {1, 3, 5, 7}));
            Assert.Equals(-1, _binarySearch.Chop(0, new[] {1, 3, 5, 7}));
            Assert.Equals(-1, _binarySearch.Chop(2, new[] {1, 3, 5, 7}));
            Assert.Equals(-1, _binarySearch.Chop(4, new[] {1, 3, 5, 7}));
            Assert.Equals(-1, _binarySearch.Chop(6, new[] {1, 3, 5, 7}));
            Assert.Equals(-1, _binarySearch.Chop(8, new[] {1, 3, 5, 7}));
        }
    }
}