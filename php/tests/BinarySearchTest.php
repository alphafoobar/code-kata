<?php
declare(strict_types=1);

namespace kata02 {

    use PHPUnit\Framework\TestCase;

    class BinarySearchTest extends TestCase
    {
        public function testSingleAndEmptyLists(): void
        {
            $binarySearch = new BinarySearch();
            $this->assertEquals(-1, $binarySearch->chop(3, []));
            $this->assertEquals(-1, $binarySearch->chop(3, [1]));
            $this->assertEquals(0, $binarySearch->chop(1, [1]));
        }

        public function testListsOf3(): void
        {
            $binarySearch = new BinarySearch();
            $this->assertEquals(0, $binarySearch->chop(1, [1, 3, 5]));
            $this->assertEquals(1, $binarySearch->chop(3, [1, 3, 5]));
            $this->assertEquals(2, $binarySearch->chop(5, [1, 3, 5]));
            $this->assertEquals(-1, $binarySearch->chop(0, [1, 3, 5]));
            $this->assertEquals(-1, $binarySearch->chop(2, [1, 3, 5]));
            $this->assertEquals(-1, $binarySearch->chop(4, [1, 3, 5]));
            $this->assertEquals(-1, $binarySearch->chop(6, [1, 3, 5]));
        }

        public function testListsOf4(): void
        {
            $binarySearch = new BinarySearch();
            $this->assertEquals(0, $binarySearch->chop(1, [1, 3, 5, 7]));
            $this->assertEquals(1, $binarySearch->chop(3, [1, 3, 5, 7]));
            $this->assertEquals(2, $binarySearch->chop(5, [1, 3, 5, 7]));
            $this->assertEquals(3, $binarySearch->chop(7, [1, 3, 5, 7]));
            $this->assertEquals(-1, $binarySearch->chop(0, [1, 3, 5, 7]));
            $this->assertEquals(-1, $binarySearch->chop(2, [1, 3, 5, 7]));
            $this->assertEquals(-1, $binarySearch->chop(4, [1, 3, 5, 7]));
            $this->assertEquals(-1, $binarySearch->chop(6, [1, 3, 5, 7]));
            $this->assertEquals(-1, $binarySearch->chop(8, [1, 3, 5, 7]));
        }
    }
}
