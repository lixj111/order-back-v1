package com.example.orderbackv1.common;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResult<T> {
    private List<T> message;
    private Meta meta;

    // 内部 Meta 类
    public static class Meta {
        private String msg;
        private int status;

        // 构造方法
        public Meta(String msg, int status) {
            this.msg = msg;
            this.status = status;
        }

        // Getter 和 Setter 方法
        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }
    }
}