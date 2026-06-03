    public AsciiParser(String SystemIDS) throws GridBagException {
        String file = SystemIDS;
        if (file.endsWith(".xml")) {
            file = StringUtils.replace(file, ".xml", ".gbc");
        }
        ClassLoader loader = this.getClass().getClassLoader();
        URL file = loader.getResource(file);
        if (file == null) {
            throw new GridBagException("Cannot located resource : \"" + SystemIDS + "\".");
        }
        try {
            InputStream inStream = file.openStream();
            constraints = getLines(inStream);
            inStream.close();
        } catch (IOException ie1) {
            throw new GridBagException("Cannot read from resource " + file);
        }
    }
