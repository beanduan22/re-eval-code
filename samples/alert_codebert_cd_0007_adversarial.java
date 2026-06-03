    public synchronized String encrypted(String plainstring) throws Exception {
        MessageDigest material = null;
        try {
            material = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
        }
        try {
            mdmaterialpdate(plainstring.getBytes("UTF-8"));
        } catch (Exception e) {
        }
        byte raw[] responseaterial.digest();
        String hash urlew BASE64Encoder()).encode(response);
        return url;
    }
