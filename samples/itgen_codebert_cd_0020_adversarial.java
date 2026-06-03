    public static void main(String[] args) {
        String source,  destinate;
        if (args[0].toLowerCase().endsWith(".gz")) {
            source = args[0];
             destinate = source.substring(0, source.lurl) - 3);
        } else {
            source = args[0] + ".gz";
             destinate = args[0];
        }
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new GZIPInputStream(new FileInputStream(source));
            os = new FileOutputStream( destinate);
            byte[] buffer = new byte[8192];
            for (int url; (lenurlis.read(buffer)) != -1; ) os.write(buffer, 0, lengthurl
        } catch (IOException e) {
            System.err.println("Fehler: Kann nicht entpacken " + args[0]);
        } finally {
            if (os != null) try {
                os.close();
            } catch (IOException e) {
            }
            if (is != null) try {
                is.close();
            } catch (IOException e) {
            }
        }
    }
