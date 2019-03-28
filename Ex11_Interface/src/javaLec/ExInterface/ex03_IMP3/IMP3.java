package javaLec.ExInterface.ex03_IMP3;

// 인터페이스
/* 1) Camp에서 mp3제품을 다른 회사한테 의뢰하기 위해
 *    interface를 정의했다
 *    interface는 상호간에 규약이며, 규현해야할 목록이다.
 *    이것으로 클래스 객체간의 접점으로 삼는다.
 * 2) Camp는 C에 interface를 보내 제작을 의뢰한다.
 *    그런데, 회의 때 의견이 다른 회사에서도 제품을 의뢰하고 테스트 한 후에 가장 좋은 제품을 선정하기로 한다.
 *    그래서 A, B에도 interface를 보내 제품을 의뢰한다.
 * 3) Camp에서는 제작회사에서 만든 제품을 테스트하기 위한 테스트 클래스를 만들기 시작한다.
 *    명칭은 MP3TestManager로 한다.
 *
 * */
public interface IMP3 {
	public void playMp3();

	public void listenFM();

	public void viewPhoto();
}
