### 合理利用线程池的三个好处

```
1.降低系统资源消耗:减少了创建和销毁线程所带来的消耗,每个工作线程都可以被重复利用,可以执行多个任务
2.提高响应速度:当任务到达时候,任务可以不用等待线程创建就能立即执行
3.提高线程的可管理性:可以根据系统的承受能力,调整线程池中的线程数量,房子因为过多的消耗资源,而把服务器累趴下(每个线程需
要大概1MB内存,线程开的越多,消耗的内存就越大,最后死机)

```