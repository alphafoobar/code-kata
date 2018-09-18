import org.scalatest._

class BinarySearchTest extends FlatSpec {

  private val search = new BinarySearch
  
  it should "handle empty lists and lists with a single item" in {
    assert(-1  === search.chop(3, Array[Int]()))
    assert(-1 === search.chop(3, Array[Int](1)))
    assert(0  === search.chop(1, Array[Int](1)))
  }

  it should "handle lists with 3 items" in {
    assert(0  === search.chop(1, Array[Int](1, 3, 5)))
    assert(1  === search.chop(3, Array[Int](1, 3, 5)))
    assert(2  === search.chop(5, Array[Int](1, 3, 5)))
    assert(-1  === search.chop(0, Array[Int](1, 3, 5)))
    assert(-1  === search.chop(2, Array[Int](1, 3, 5)))
    assert(-1  === search.chop(4, Array[Int](1, 3, 5)))
    assert(-1  === search.chop(6, Array[Int](1, 3, 5)))
  }

  it should "handle lists with 4 items" in {
    assert(0  === search.chop(1, Array[Int](1, 3, 5, 7)))
    assert(1  === search.chop(3, Array[Int](1, 3, 5, 7)))
    assert(2  === search.chop(5, Array[Int](1, 3, 5, 7)))
    assert(3  === search.chop(7, Array[Int](1, 3, 5, 7)))
    assert(-1  === search.chop(0, Array[Int](1, 3, 5, 7)))
    assert(-1  === search.chop(2, Array[Int](1, 3, 5, 7)))
    assert(-1  === search.chop(4, Array[Int](1, 3, 5, 7)))
    assert(-1  === search.chop(6, Array[Int](1, 3, 5, 7)))
    assert(-1  === search.chop(8, Array[Int](1, 3, 5, 7)))
  }
}
