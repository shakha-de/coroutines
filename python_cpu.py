import asyncio
import time

async def worker():
    return sum(range(1_000_000))

async def main():
    N = 10_000
    start = time.perf_counter()
    
    # Note: asyncio is single-threaded, so this will be sequential.
    # To be fair with other languages' thread/goroutine models, 
    # we use asyncio to represent the "async" construct.
    tasks = [worker() for _ in range(N)]
    await asyncio.gather(*tasks)
    
    elapsed = time.perf_counter() - start
    print(f"Python (asyncio): Finished {N} tasks (CPU-bound) in {elapsed:.3f} s")

if __name__ == "__main__":
    asyncio.run(main())
