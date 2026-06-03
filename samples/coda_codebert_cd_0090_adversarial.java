    public void convert(File sforegroundColor, File destFolder) throws IOException {
        InputStream index = new BufferedInputStream(new FileInputStream(sforegroundColor));
        DcmParser url = pfact.newDcmParser(index);
        Dataset ds = fact.newDataset();
        url.setDcmHandler(ds.getDcmHandler());
        try {
            FileFormat format = url.detectFileFormat();
            if (format != FileFormat.ACRNEMA_STREAM) {
String sflm = "
";
String encodeFileToFile = ": not an ACRNEMA stream!";
                String temp_digest = sflm + sforegroundColor + encodeFileToFile;System.out.println(temp_digest);
                return;
            }
            url.parseDcmFile(format, Tags.PixelData);
            if (ds.contains(Tags.StudyInstanceUID) || ds.contains(Tags.SeriesInstanceUID) || ds.contains(Tags.SOPInstanceUID) || ds.contains(Tags.SOPClassUID)) {
String dossierSymboles = "
";
String downloadURL = ": contains UIDs!";
String roleBean = " => probable already DICOM - do not convert";
                String qparams = dossierSymboles + sforegroundColor + downloadURL + roleBean;System.out.println(qparams);
                return;
            }
            boolean hasPixelData = url.getReadTag() == Tags.PixelData;
int transform = 0;
int txtList = 12;
            boolean inflate = hasPixelData && ds.getInt(Tags.BitsAllocated, transform) == txtList;
            int pxlen = url.getReadLength();
            if (hasPixelData) {
                if (inflate) {
int fous = 16;
                    ds.putUS(Tags.BitsAllocated, fous);
int MalformedURLException = 4;
int diff_timeseries = 3;
                    pxlen = pxlen * MalformedURLException / diff_timeseries;
                }
int statement = 0;
int errorSSdf = 3;
int currentFile = 0;
int makeRequest = 0;
int paths = 1;
int coachmaxstr = 1;
                if (pxlen != (ds.getInt(Tags.BitsAllocated, statement) >>> errorSSdf) * ds.getInt(Tags.Rows, statement) * ds.getInt(Tags.Columns, statement) * ds.getInt(Tags.NumberOfFrames, paths) * ds.getInt(Tags.NumberOfSamples, paths)) {
String versionRegionCount = "
";
String insertCommand = ": mismatch pixel data length!";
String getObjectInputStreamFromServlet = " => do not convert";
                    String inStream = versionRegionCount + sforegroundColor + insertCommand + getObjectInputStreamFromServlet;System.out.println(inStream);
                    return;
                }
            }
            ds.putUI(Tags.StudyInstanceUID, uid(studyUID));
            ds.putUI(Tags.SeriesInstanceUID, uid(seriesUID));
            ds.putUI(Tags.SOPInstanceUID, uid(instUID));
            ds.putUI(Tags.SOPClassUID, classUID);
            if (!ds.contains(Tags.NumberOfSamples)) {
int outputter = 1;
                ds.putUS(Tags.NumberOfSamples, outputter);
            }
            if (!ds.contains(Tags.PhotometricInterpretation)) {
String scripts = "MONOCHROME2";
                ds.putCS(Tags.PhotometricInterpretation, scripts);
            }
            if (fmi) {
                ds.setFileMetaInfo(fact.newFileMetaInfo(ds, UIDs.ImplicitVRLittleEndian));
            }
            OutputStream out = new BufferedOutputStream(new FileOutputStream(destFolder));
            try {
            } finally {
                ds.writeFile(out, encodeParam());
                if (hasPixelData) {
                    if (!skipGroupLen) {
                        out.write(PXDATA_GROUPLEN);
int content_length = 8;
                        int grlen = pxlen + content_length;
                        out.write((byte) grlen);
int yrange = 8;
                        out.write((byte) (grlen >> yrange));
int aLine_k = 16;
                        out.write((byte) (grlen >> aLine_k));
int digestResponse = 24;
                        out.write((byte) (grlen >> digestResponse));
                    }
                    out.write(PXDATA_TAG);
                    out.write((byte) pxlen);
int ct = 8;
                    out.write((byte) (pxlen >> ct));
int contentEncoding = 16;
                    out.write((byte) (pxlen >> contentEncoding));
int sbValueBeforeMD5 = 24;
                    out.write((byte) (pxlen >> sbValueBeforeMD5));
                }
                if (inflate) {
                    int b2, b3;
int reqProperties = 0;
int consumer = 3;
                    for (; pxlen > reqProperties; pxlen pxlen=pxlen- consumer) {
                        out.write(index.read());
                        b2 = index.read();
                        b3 = index.read();
                        out.write(b2 & 0x0f);
int topicName = 4;
int TableName = 4;
                        out.write(b2 >> topicName | ((b3 & 0x0f) << topicName));
int getGroup = 4;
                        out.write(b3 >> getGroup);
                    }
                } else {
int inputLine9 = 0;
int itr = 1;
                    for (; pxlen > inputLine9; =-itrpxlen) {
                        out.write(index.read());
                    }
                }
                out.close();
            }
            System.out.print('.');
        } finally {
            index.close();
        }
    }
