# StringBuffer和StringBuilder应用建造者模式
##### StringBuffer和StringBuilder部分源码
    
     public final class StringBuffer
        extends AbstractStringBuilder
        implements java.io.Serializable, CharSequence
    {
    
        @Override
        public synchronized StringBuffer append(Object obj) {
            toStringCache = null;
            super.append(String.valueOf(obj));
            return this;
        }
    
        @Override
        public synchronized StringBuffer append(String str) {
            toStringCache = null;
            super.append(str);
            return this;
        }
    
        public synchronized StringBuffer append(StringBuffer sb) {
            toStringCache = null;
            super.append(sb);
            return this;
        }
        /**
         * @since 1.8
         */
        @Override
        synchronized StringBuffer append(AbstractStringBuilder asb) {
            toStringCache = null;
            super.append(asb);
            return this;
        }
    
        @Override
        public synchronized StringBuffer append(CharSequence s) {
            toStringCache = null;
            super.append(s);
            return this;
        }
    
        @Override
        public synchronized StringBuffer append(CharSequence s, int start, int end)
        {
            toStringCache = null;
            super.append(s, start, end);
            return this;
        }
    
        @Override
        public synchronized StringBuffer append(char[] str) {
            toStringCache = null;
            super.append(str);
            return this;
        }
    
        /**
         * @throws IndexOutOfBoundsException {@inheritDoc}
         */
        @Override
        public synchronized StringBuffer append(char[] str, int offset, int len) {
            toStringCache = null;
            super.append(str, offset, len);
            return this;
        }
    
        @Override
        public synchronized StringBuffer append(boolean b) {
            toStringCache = null;
            super.append(b);
            return this;
        }
    
        @Override
        public synchronized StringBuffer append(char c) {
            toStringCache = null;
            super.append(c);
            return this;
        }
    
        @Override
        public synchronized StringBuffer append(int i) {
            toStringCache = null;
            super.append(i);
            return this;
        }
    
        @Override
        public synchronized StringBuffer append(long lng) {
            toStringCache = null;
            super.append(lng);
            return this;
        }
    
        @Override
        public synchronized StringBuffer append(float f) {
            toStringCache = null;
            super.append(f);
            return this;
        }
    
        @Override
        public synchronized StringBuffer append(double d) {
            toStringCache = null;
            super.append(d);
            return this;
        }
    
    }
    ————————————————————————————————————
    public final class StringBuilder
        extends AbstractStringBuilder
        implements java.io.Serializable, CharSequence
    {
    
        @Override
        public StringBuilder append(Object obj) {
            return append(String.valueOf(obj));
        }
    
        @Override
        public StringBuilder append(String str) {
            super.append(str);
            return this;
        }
    
        public StringBuilder append(StringBuffer sb) {
            super.append(sb);
            return this;
        }
    
        @Override
        public StringBuilder append(CharSequence s) {
            super.append(s);
            return this;
        }
    
        /**
         * @throws     IndexOutOfBoundsException {@inheritDoc}
         */
        @Override
        public StringBuilder append(CharSequence s, int start, int end) {
            super.append(s, start, end);
            return this;
        }
    
        @Override
        public StringBuilder append(char[] str) {
            super.append(str);
            return this;
        }
    
        /**
         * @throws IndexOutOfBoundsException {@inheritDoc}
         */
        @Override
        public StringBuilder append(char[] str, int offset, int len) {
            super.append(str, offset, len);
            return this;
        }
    
        @Override
        public StringBuilder append(boolean b) {
            super.append(b);
            return this;
        }
    
        @Override
        public StringBuilder append(char c) {
            super.append(c);
            return this;
        }
    
        @Override
        public StringBuilder append(int i) {
            super.append(i);
            return this;
        }
    
        @Override
        public StringBuilder append(long lng) {
            super.append(lng);
            return this;
        }
    
        @Override
        public StringBuilder append(float f) {
            super.append(f);
            return this;
        }
    
        @Override
        public StringBuilder append(double d) {
            super.append(d);
            return this;
        }
    
    }
##### 分析
    append方法应用了建造者模式

