import asyncio
import time

async def worker():
    await asyncio.sleep(0.01) # 10ms

async def main():
    N = 10_000
    start = time.perf_counter()
    
    tasks = [worker() for _ in range(N)]
    await asyncio.gather(*tasks)
    
    elapsed = time.perf_counter() - start
    print(f"Python (asyncio): Finished {N} tasks in {elapsed:.3f} s")

if __name__ == "__main__":
    asyncio.run(main())
