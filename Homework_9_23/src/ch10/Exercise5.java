package ch10;

public class Exercise5 {
/*1.  다음과 같은 메소드가 잇을 때 예외를 잘못 처리한 것은 무엇입니까?

public void method1() throws NumberFormauException, ClassNotFoundException { ... }

 try{ method1(); } catch (Exception e) { }

 void method2() throws Exception { method1();  }

 try{ method1(); } catch (Exception e) { } catch (ClassNotFoundException e) { }->답

④try{ method1(); } catch (ClassNotFoundException e) { } catch (NumberFormauException e) { }
                     Exception e를 먼저 캐치하면 뒤에는 실행x                      
                                                */
}
