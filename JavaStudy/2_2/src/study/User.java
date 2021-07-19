package study;

/**
 * User.java
 */
class User {

    // フィールド変数
    private String userName;
    private int id;
    private String password;

    // コンストラクタ
    public User() {
        this.userName = "hoge";
        this.id = 123;
        this.password = "abc123";
    }

    // ① 以下のルールに従いアカウント情報（名前、ID、パスワード）を出力するメソッドを作成してください。
    // アクセス修飾子:「protected」
    // メソッド名:「printAccountInfo」
    public void name() {
    System.out.println("ユーザー名は、"+this.userName);
    }
    public void id() {
    System.out.println("IDは"+this.id);
    }
   
    protected String printAccountInfo() {
    	return this.password;
    	
    }
   

}
