package main

import (
	"fmt"
	"sync"
	"time"
)

func worker(wg *sync.WaitGroup) {
	defer wg.Done()
	time.Sleep(10 * time.Millisecond)
}

func main() {
	const N = 10_000
	var wg sync.WaitGroup
	wg.Add(N)

	start := time.Now()

	for i := 0; i < N; i++ {
		go worker(&wg)
	}

	wg.Wait()
	elapsed := time.Since(start)

	fmt.Printf("Go: Finished %d goroutines in %v\n", N, elapsed)
}