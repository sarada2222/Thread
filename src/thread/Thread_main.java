package thread;

public class Thread_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread_run th[] = new Thread_run [3];
		th [0] = new Thread_run();
		th [1] = new Thread_run();
		th [2] = new Thread_run();
		for(int i=0;i<=2;i++) {
			th[i].start();
			try {
					th[i].join();
				}catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		Thread_runnable th2[] = new Thread_runnable [3];
		th2 [0] = new Thread_runnable();
		th2 [1] = new Thread_runnable();
		th2 [2] = new Thread_runnable();
		for(int i=0;i<=2;i++) {
			th2[i].run();
		}
		//Thread_run th = new Thread_run();
		//Thread_runnable th2 = new Thread_runnable();
		//th.start();
		//th2.run();
		//try {
		//	th.join();
		//}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
		for(int i = 0;i < 10;i++) {
			System.out.println("main‚©‚ço—Í :"+i);
		}
	}

}
