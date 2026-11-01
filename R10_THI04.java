//Rule 10 Ensure that threads performing blocking operations can be terminated
public final class SocketReader implements Runnable {
  // Other methods...

  public void readData() throws IOException {
    String string;
    try {
      while ((string = in.readLine()) != null) {
        // Blocks until end of stream (null)
      }
    } finally {
      shutdown();
    }
  }

  public void shutdown() throws IOException {
    socket.close();
  }

  public static void main(String[] args) 
                          throws IOException, InterruptedException {
    SocketReader reader = new SocketReader("somehost", 25);
    Thread thread = new Thread(reader);
    thread.start();
    Thread.sleep(1000);
    reader.shutdown();
  }
}
