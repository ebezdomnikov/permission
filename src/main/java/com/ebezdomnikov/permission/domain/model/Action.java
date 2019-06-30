package com.ebezdomnikov.permission.domain.model;

public enum Action {
    INDEX {
        @Override
        public String toString() {
            return "index";
        }
    },
    SHOW {
        @Override
        public String toString() {
            return "show";
        }
    },
    UPDATE {
        @Override
        public String toString() {
            return "update";
        }
    },
    STORE {
        @Override
        public String toString() {
            return "store";
        }
    },
    DELETE {
        @Override
        public String toString() {
            return "delete";
        }
    },
}
