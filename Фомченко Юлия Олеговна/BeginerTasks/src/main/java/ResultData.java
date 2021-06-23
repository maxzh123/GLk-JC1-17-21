
public class ResultData implements Comparable<ResultData>{
    private int code;
    private String message;

    public ResultData(int code, String message) {
        this.code = code;
        this.message = message;
    }
    public ResultData(String message) {
        this.code = 0;
        this.message = message;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public int compareTo(ResultData o) {
        if (o==null) return 0;
        if (code>o.code) return 1;
        else if (code<o.code) return -1;
        return - message.compareTo(o.message);
    }
}
