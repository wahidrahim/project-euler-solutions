fn main() {
    let mut sum = 0u;

    for n in range(0, 1000) {
        if n % 3 == 0 || n % 5 == 0 {
            sum += n;
        }
    }

    println!("{}", sum);
}
