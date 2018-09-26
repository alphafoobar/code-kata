pub fn chop(_key: i64, _array: &[i64]) -> i64 {
    unimplemented!("Just not done yet!")
}

#[cfg(test)]
mod tests {
    #[test]
    fn search_empty_array() {
        let array: [i64; 0] = [];
        assert_eq!(-1, super::chop(1, &array));
    }

    #[test]
    fn search_singleton() {
        let array: [i64; 1] = [1];
        assert_eq!(0, super::chop(1, &array));
        assert_eq!(-1, super::chop(3, &array));
    }

    #[test]
    fn search_array_of_three() {
        let array: [i64; 3] = [1, 3, 5];
        assert_eq!(0, super::chop(1, &array));
        assert_eq!(1, super::chop(3, &array));
        assert_eq!(2, super::chop(5, &array));
        assert_eq!(-1, super::chop(0, &array));
        assert_eq!(-1, super::chop(2, &array));
        assert_eq!(-1, super::chop(4, &array));
        assert_eq!(-1, super::chop(6, &array));
    }

    #[test]
    fn search_array_or_four() {
        let array: [i64; 4] = [1, 3, 5, 7];
        assert_eq!(0, super::chop(1, &array));
        assert_eq!(1, super::chop(3, &array));
        assert_eq!(2, super::chop(5, &array));
        assert_eq!(3, super::chop(7, &array));
        assert_eq!(-1, super::chop(0, &array));
        assert_eq!(-1, super::chop(2, &array));
        assert_eq!(-1, super::chop(4, &array));
        assert_eq!(-1, super::chop(6, &array));
        assert_eq!(-1, super::chop(8, &array));
    }
}