import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileToOutput {
	public void printFileToOutput(VM[] vm) {
		int i,j,k;
		System.out.print("Storing info from File 1...");
		String csvFile = "C:\\Users\\navinadarsh\\Downloads\\DataSet3\\F1.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		try {
			i=0;
			br = new BufferedReader(new FileReader(csvFile));
			line=br.readLine();
			while ((line = br.readLine()) != null) {
				String[] columnVal = line.split(cvsSplitBy);
				vm[i]=new VM(1000);
				vm[i].StoreVMID((Integer.parseInt(columnVal[0])));
				vm[i].StoreVMName(columnVal[1]);
				i++;
			}
		}catch(FileNotFoundException e) {
        e.printStackTrace();
		}catch (IOException e) {
        e.printStackTrace();
		}finally {
			if (br != null) {
				try {
					br.close();
				}catch (IOException e) {
                e.printStackTrace();
				}
			}
		}
		System.out.println("...Completed");
		System.out.print("Storing info from File 2...");   
		csvFile = "C:\\Users\\navinadarsh\\Downloads\\DataSet3\\F2.csv";
		br = null;
		line = "";
		cvsSplitBy = ",";

		try {
			br = new BufferedReader(new FileReader(csvFile));
			line=br.readLine();
			while ((line = br.readLine()) != null) {
				String[] columnVal = line.split(cvsSplitBy);
				vm[Integer.parseInt(columnVal[0])-1].StoreUtil(columnVal[1],Double.parseDouble(columnVal[2]),Double.parseDouble(columnVal[3]),Double.parseDouble(columnVal[4]));
			}

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        if (br != null) {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    System.out.println("...Completed");
    System.out.print("Storing info from File 3...");
    csvFile = "C:\\Users\\navinadarsh\\Downloads\\DataSet3\\F3.csv";
    br = null;
    line = "";
    cvsSplitBy = ",";
    try {

        br = new BufferedReader(new FileReader(csvFile));
        line=br.readLine();
        while ((line = br.readLine()) != null) {
            // use comma as separator
            String[] columnVal = line.split(cvsSplitBy);
            if(columnVal.length==4) {
            	vm[Integer.parseInt(columnVal[0])-1].StoreAlloc(columnVal[1],Double.parseDouble(columnVal[2]),Double.parseDouble(columnVal[3]),1000);
            }else if(columnVal.length==5)
                    vm[Integer.parseInt(columnVal[0])-1].StoreAlloc(columnVal[1],Double.parseDouble(columnVal[2]),Double.parseDouble(columnVal[3]),Double.parseDouble(columnVal[4]));
        }

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        if (br != null) {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    System.out.println("...Completed");
    System.out.print("Storing info from File 4...");
    csvFile = "C:\\Users\\navinadarsh\\Downloads\\DataSet3\\F4.csv";
    br = null;
    line = "";
    cvsSplitBy = ",";
    try {

        br = new BufferedReader(new FileReader(csvFile));
        line=br.readLine();
        while ((line = br.readLine()) != null) {
            // use comma as separator
            String[] columnVal = line.split(cvsSplitBy);
            if(columnVal.length==4) {
            	vm[Integer.parseInt(columnVal[0])-1].StoreProp(columnVal[2],Double.parseDouble(columnVal[3]),1000);
            }else if(columnVal.length==5)
                    vm[Integer.parseInt(columnVal[0])-1].StoreProp(columnVal[2],Double.parseDouble(columnVal[3]),Double.parseDouble(columnVal[4]));
        }

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        if (br != null) {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    System.out.println("...Completed");
    System.out.print("Storing info from File 5...");
    csvFile = "C:\\Users\\navinadarsh\\Downloads\\DataSet3\\F5.csv";
    br = null;
    line = "";
    cvsSplitBy = ",";
    try {

        br = new BufferedReader(new FileReader(csvFile));
        line=br.readLine();
        while ((line = br.readLine()) != null) {
            // use comma as separator
            String[] columnVal = line.split(cvsSplitBy);
            vm[Integer.parseInt(columnVal[0])-1].StorePower(columnVal[1],Double.parseDouble(columnVal[2]),1000.0);
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        if (br != null) {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    System.out.println("...Completed");
    System.out.print("Storing info from File 6...");
    csvFile = "C:\\Users\\navinadarsh\\Downloads\\DataSet3\\F6.csv";
    br = null;
    line = "";
    cvsSplitBy = ",";
    try {

        br = new BufferedReader(new FileReader(csvFile));
        line=br.readLine();
        while ((line = br.readLine()) != null) {
            // use comma as separator
            String[] columnVal = line.split(cvsSplitBy);
            vm[Integer.parseInt(columnVal[0])-1].StoreHostID(Double.parseDouble(columnVal[1]),Double.parseDouble(columnVal[2]),Double.parseDouble(columnVal[3]));
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        if (br != null) {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    System.out.println("...Completed");
    System.out.print("Storing info from File 7...");
    csvFile = "C:\\Users\\navinadarsh\\Downloads\\DataSet3\\F7.csv";
    br = null;
    line = "";
    cvsSplitBy = ",";
    try {

        br = new BufferedReader(new FileReader(csvFile));
        line=br.readLine();
        while ((line = br.readLine()) != null) {
            // use comma as separator
            String[] columnVal = line.split(cvsSplitBy);
            for(i=0;i<4;++i) {
                vm[i].StoreClusterID(Double.parseDouble(columnVal[0]),Double.parseDouble(columnVal[1]), Double.parseDouble(columnVal[2]), Double.parseDouble(columnVal[3]));	
            }
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        if (br != null) {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    System.out.println("...Completed");
    System.out.println("Calculating Allocation Price using File 8...");
    csvFile = "C:\\Users\\navinadarsh\\Downloads\\DataSet3\\F8.csv";
    br = null;
    line = "";
    cvsSplitBy = ",";
    try {

        br = new BufferedReader(new FileReader(csvFile));
        line=br.readLine();
        while ((line = br.readLine()) != null) {
            // use comma as separator
            String[] columnVal = line.split(cvsSplitBy);
        	if(columnVal[1].equals("	cpu"))
        		k=0;
        	else if(columnVal[1].equals("	store"))
        		k=1;
        	else if(columnVal[1].equals("	mem"))
        		k=2;
        	else 
        		k=3;
            for(i=0;i<4;++i) {
            	for(j=(int)(java.lang.Math.floor(Double.parseDouble(columnVal[3])/50));j<(int)(java.lang.Math.floor((Double.parseDouble(columnVal[4])/50)));++j)
            		if(vm[i].RetClusterID(j)==(int)Double.parseDouble(columnVal[0])) {
            			if(k==0) {
            				vm[i].updateAllocPrice(vm[i].allocation1(j)*Double.parseDouble(columnVal[2]));
            			}else if(k==1)
            				vm[i].updateAllocPrice(vm[i].allocation2(j)*Double.parseDouble(columnVal[2]));
            			else if(k==2)
            				vm[i].updateAllocPrice(vm[i].allocation3(j)*Double.parseDouble(columnVal[2]));
            		}
            	}
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        if (br != null) {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    for(i=0;i<4;++i) {
    	System.out.println("Price of allocating resources to Virtual Machine "+ (i+1) + " is : $" + vm[i].RetAllocPrice());
    }System.out.println("...Completed");
    System.out.println("Calculating Utilization Price using File 8...");
    csvFile = "C:\\Users\\navinadarsh\\Downloads\\DataSet3\\F8.csv";
    br = null;
    line = "";
    cvsSplitBy = ",";
    try {

        br = new BufferedReader(new FileReader(csvFile));
        line=br.readLine();
        while ((line = br.readLine()) != null) {
            // use comma as separator
            String[] columnVal = line.split(cvsSplitBy);
        	if(columnVal[1].equals("	cpu"))
        		k=0;
        	else if(columnVal[1].equals("	store"))
        		k=1;
        	else if(columnVal[1].equals("	mem"))
        		k=2;
        	else 
        		k=3;
            for(i=0;i<4;++i) {
            	for(j=(int)(java.lang.Math.floor(Double.parseDouble(columnVal[3])/50));j<(int)(java.lang.Math.floor((Double.parseDouble(columnVal[4])/50)));++j)
            		if(vm[i].RetClusterID(j)==(int)Double.parseDouble(columnVal[0])) {
            			if(k==0) {
            				vm[i].updateAllocPrice(vm[i].RetUtil1(j)*Double.parseDouble(columnVal[2]));
            			}else if(k==1)
            				vm[i].updateAllocPrice(vm[i].RetUtil2(j)*Double.parseDouble(columnVal[2]));
            			else if(k==2)
            				vm[i].updateAllocPrice(vm[i].RetUtil3(j)*Double.parseDouble(columnVal[2]));
            		}
            	}
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        if (br != null) {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    for(i=0;i<4;++i) {
    	System.out.println("Price of  Virtual Machine "+ (i+1) + " is : $" + vm[i].RetAllocPrice());
    }System.out.println("...Completed");
    System.out.println("Calculating Price of running property using File 9...");
    csvFile = "C:\\Users\\navinadarsh\\Downloads\\DataSet3\\F9.csv";
    br = null;
    line = "";
    cvsSplitBy = ",";
    try {

        br = new BufferedReader(new FileReader(csvFile));
        line=br.readLine();
        while ((line = br.readLine()) != null) {
            // use comma as separator
            String[] columnVal = line.split(cvsSplitBy);
        	for(i=0;i<4;++i) {
            	for(j=0;j<vm[i].RetNoProp();++j)
            		if(vm[i].RetPropname(j).equals(columnVal[1])) {
            			vm[i].updateClusterPrice(vm[i].RetPropUse(j)*Double.parseDouble(columnVal[2]));
            		}
            	}
        	}
    	} catch (FileNotFoundException e) {
        	e.printStackTrace();
    	} catch (IOException e) {
        	e.printStackTrace();
    	} finally {
    		if (br != null) {
            	try {
            		br.close();
            	} catch (IOException e) {
                	e.printStackTrace();
            	}
        	}
    	}	
    	for(i=0;i<4;++i) {
    		System.out.println("Total Price of  Virtual Machine "+ (i+1) + " is : $" + (vm[i].RetAllocPrice()+vm[i].RetClusterPrice()));
    	}System.out.println("...Completed");
		    
	}
	
}
