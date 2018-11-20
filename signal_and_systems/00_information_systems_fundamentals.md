Table of Contents
======
- [Informatics](https://github.com/6476158/lecturenotes/blob/master/signal_and_systems/00_information_systems_fundamentals.md#informatics)
- [Data - Information - Knowledge](https://github.com/6476158/lecturenotes/blob/master/signal_and_systems/00_information_systems_fundamentals.md#data---information---knowledge)

- [System](https://github.com/6476158/lecturenotes/blob/master/signal_and_systems/00_information_systems_fundamentals.md#system)

- [Signal](https://github.com/6476158/lecturenotes/blob/master/signal_and_systems/00_information_systems_fundamentals.md#signal)
  - [Analog to Digital Conversion](https://github.com/6476158/lecturenotes/blob/master/signal_and_systems/00_information_systems_fundamentals.md#analog-to-digital-conversion-adc)


Informatics
======
Informatics is the study of the structure, behaviour, and interactions of natural and engineered computational systems. The term informatics broadly describes the study and practise of creating, storing, finding, manipulating and sharing information. Another definition, The term informatics broadly describes the study and practice of creating, storing, finding, manipulating and sharing information.

### Etymology of Informatics
In 1956 the German computer scientist Karl Steinbuch coined the word Informatik
> [ Informatik: Automatische Informationsverarbeitung ("Informatics:
Automatic Information Processing")]

The French term informatique was coined in 1962 by Philippe Dreyfus
> [Dreyfus, Phillipe. L’informatique. Gestion, Paris, June 1962, pp.
240–41]

The term was coined as a combination of information and automatic to describe the science of automating information interactions

Data - Information - Knowledge
======
### Data
unprocessed facts and figures without any added interpretation or analysis. 

 {The price of crude oil is $80 per barrel.}

### Information
data that has been interpreted so that it has meaning for the user.

{The price of crude oil has risen from $70 to $80 per barrel}
> [gives meaning to the data and so is said to be information to someone who tracks oil prices.]

Information Types
- Numeric
    - Must represent range of data needed
    - Very desirable to represent data such that simple, straightforward computation for common arithmetic operations permitted
    - Tight relation to binary numbers
- Non-numeric
    - Greater flexibility since arithmetic operations not applied.
    - Not tied to binary numbers
    
    ![Not Found!](https://preview.ibb.co/fbNMuf/image.png)
    

### Knowledge
a combination of information , experience and insight that may benefit the individual or the organisation.

{When crude oil prices go up by $10 per barrel, it's likely that petrol prices will rise by 2p per litre.}
>[ insight : the capacity to gain an accurate and deep understanding of someone or something; an accurate and deep understanding]

### Converting data into information
![Not Found!](https://image.ibb.co/g11YPf/test.png)

- Data becomes information when it is applied to some purpose and adds value for the recipient.

>### For example a set of raw sales figures is data .
>For the Sales Manager tasked with solving a problem of poor sales in one region, or deciding the future focus of a sales drive, the raw
data needs to be processed into a sales report . It is the sales report that provides information .

- Collecting data is expensive

  - you need to be very clear about why you need it and how you plan to use it.
  - One of the main reasons that organisations collect data is to monitor and improve performance.
    - if you are to have the information you need for control and performance improvement, you need to:
      - collect data on the indicators that really do affect performance
      - collect data reliably and regularly
      - be able to convert data into the information you need.
 
- To be useful, data must satisfy a number of conditions. It must be:
  - relevant to the specific purpose
  - complete
  - accurate
  - timely
    - data that arrives after you have made your decision is of no value
  - in the right format
    - information can only be analysed using a spreadsheet if all the data can be entered into the computer system
  - available at a suitable price
    - the benefits of the data must merit the cost of collecting or buying it.

- The same criteria apply to information .
  - It is important
    - to get the right information
    - to get the information right
    
- Ultimately the tremendous amount of information that is generated is only useful if it can be applied to create knowledge within the
organisation.      

- There is considerable blurring and confusion between the terms information and knowledge .

- Think of knowledge as being of two types:
  - Formal, explicit or generally available knowledge.
    - This is knowledge that has been captured and used to develop policies and operating procedures for example.
  - Instinctive, subconscious, tacit or hidden knowledge.
    - Within the organisation there are certain people who hold specific knowledge or have the 'know how'
      >{"I did something very similar to that last year and this happened….."}

- Clearly, both types of knowledge are essential for the organisation.

- Information on its own will not create a knowledge-based organisation
>but it is a key building block.

- The right information fuels the development of intellectual capital
>which in turns drives innovation and performance
improvement.

System
======
### Definition(s) of system
A system can be broadly defined as an integrated set of elements that accomplish a defined objective. People from different engineering disciplines have different perspectives of what a "system" is. 

For example, software engineers often refer to an integrated set of computer programs as a "system" electrical engineers might refer to complex integrated circuits or an integrated set of electrical units as a "system" As can be seen, "system" depends on one’s perspective, and the “integrated set of elements that accomplish a defined objective” is an appropriate definition.

- A system is an assembly of parts where:
  - The parts or components are connected together in an organized way.
  - The parts or components are affected by being in the system (and are changed by leaving it).
  - The assembly does something.
  - The assembly has been identified by a person as being of special interest.
- Any arrangement which involves the handling, processing or manipulation of resources of whatever type can be represented as a system.
- A system is defined as multiple parts working together for a common purpose or goal.
- Systems can be large and complex
  >such as the air traffic control system or our global telecommunication network.
- Small devices can also be considered as systems
  >such as a pocket calculator, alarm clock, or 10-speed bicycle.
- Systems have inputs , processes , and outputs .
- When feedback (direct or indirect) is involved, that component is also important to the operation of the system.
- To explain all this, systems are usually explained using a model .
- A model helps to illustrate the major elements and their relationship.

![Not Found!](https://preview.ibb.co/cZrd70/test.png) *A systems model*

### Information Systems
The ways that organizations Store, Move Organize, Process their information.

<a href="https://www.youtube.com/watch?v=Qujsd4vkqFI" target="_blank"><img src="http://img.youtube.com/vi/Qujsd4vkqFI/0.jpg" width="240" height="180" border="10" /></a> 
<img src="https://preview.ibb.co/d8Z1uf/image.png" width="240" height="180" border="10" >
<img src="https://preview.ibb.co/dkxt70/image.png" width="240" height="180" border="10" >

### Information Technology
Components that implement information systems,
  - Hardware
    >physical tools: computer and network hardware, but also low-tech things like pens and paper
  - Software
    >(changeable) instructions for the hardware
  - People
  - Procedures
    >instructions for the people
  - Data/databases
  
### Digital System
Takes a set of discrete information ( inputs ) and discrete internal information ( system state ) and generates a set of discrete information ( outputs ).

![Not Found!](https://image.ibb.co/imYi70/image.png)

### A Digital Computer Example

![Not Found!](https://preview.ibb.co/csOEfL/image.png)

Signal
===
- An information variable represented by physical quantity.
- For digital systems, the variable takes on discrete values.
- Two level, or binary values are the most prevalent values in digital systems.
- Binary values are represented abstractly by:
  – digits 0 and 1
  – words (symbols) False (F) and True (T)
  – words (symbols) Low (L) and High (H)
  – and words On and Off.
- Binary values are represented by values or ranges of values of physical quantities

![Not Found!](https://preview.ibb.co/g0Y2Zf/image.png) *A typical measurement system*

### Transducers
A “transducer” is a device that converts energy from one form to another. In signal processing applications, the purpose of energy
conversion is to transfer information, not to transform energy. In physiological measurement systems, transducers may be
- input transducers (or sensors)
  - they convert a non-electrical energy into an electrical signal.
  - for example, a microphone.
  
- output transducers (or actuators)
  - they convert an electrical signal into a non-electrical energy.
  - For example, a speaker.
  
### Analogue signal
The analogue signal – a continuous variable defined with infinite precision - is converted to a discrete sequence of measured
values which are represented digitally

Information is lost in converting from analogue to digital, due to:
- inaccuracies in the measurement
- uncertainty in timing
- limits on the duration of the measurement
These effects are called quantisation errors

### Digital signal
The continuous analogue signal has to be held before it can be sampled

![Not Found!](https://image.ibb.co/kyKFn0/image.png)

Otherwise, the signal would be changing during the measurement Only after it has been held can the signal be measured, and the measurement converted to a digital value.

![Not Found!](https://image.ibb.co/d4tVLL/image2.png)

### Analog to Digital Conversion (ADC)

<a href="https://www.youtube.com/watch?v=yWqrx08UeUs" target="_blank"><img src="http://img.youtube.com/vi/yWqrx08UeUs/0.jpg" width="240" height="180" border="10" /></a> 
<img src="https://preview.ibb.co/k7XCZf/2129.png" width="240" height="180" border="10" >
<img src="https://preview.ibb.co/cFEFn0/2137.png" width="240" height="180" border="10" >


ADC consists of four steps to digitize an analog signal:

![Not Found!](https://preview.ibb.co/iU16uf/image.png)

#### 1.Filtering
Before we sample, we have to filter the signal to limit the maximum frequency of the signal as it affects the sampling rate. Filtering should ensure that we do not distort the signal, ie remove high frequency components that affect the signal shape.
#### 2.Sampling
The sampling results in a discrete set of digital numbers that represent measurements of the signal usually taken at equal intervals of time

Sampling takes place after the hold. The hold circuit must be fast enough that the signal is not changing during the time the circuit is acquiring the signal value

We don't know what we don't measure. In the process of measuring the signal, some information is lost

Analog signal is sampled every TS secs. Ts is referred to as the sampling interval. fs = 1/Ts is called the sampling rate or sampling
frequency.

There are 3 sampling methods:
  - Ideal - an impulse at each sampling instant
  - Natural - a pulse of short width with varying amplitude
  - Flattop - sample and hold, like natural but with single amplitude value
  
The process is referred to as pulse amplitude modulation PAM and the outcome is a signal with analog (non integer) values  

![Not Found!](https://preview.ibb.co/h2nh0L/image.png)

Recovery of a sampled sine wave for different sampling rates

![Not Found!](https://image.ibb.co/dKBguf/image.png)

![Not Found!](https://preview.ibb.co/jJaKfL/image.png)

![Not Found!](https://preview.ibb.co/j3Tan0/image3.png)

![Not Found!](https://image.ibb.co/gVhh0L/image.png)

##### Sampling Theorem
According to the Nyquist theorem, the sampling rate must be at least 2 times the highest frequency contained in the signal. ( Fs >= 2fm )

Nyquist sampling rate for low-pass and bandpass signals

![Not Found!](https://preview.ibb.co/fvi870/image.png)

##### Sampling related concepts
- Over/exact/under sampling
- Regular/irregular sampling
- Linear/Logarithmic sampling
- Aliasing
- Anti-aliasing filter
- Image
- Anti-image filter

#### 3.Quantization
Sampling results in a series of pulses of varying amplitude values ranging between two limits: a min and a max. The amplitude values are infinite between the two limits. We need to map the infinite amplitude values onto a finite set of known values. 

![Not Found!](https://image.ibb.co/gh21S0/image.png)

##### Quantization Levels
The midpoint of each zone is assigned a value from 0 to L-1 (resulting in L values). Each sample falling in a zone is then          approximated to the value of the midpoint.

##### Quantization Zones
Assume we have a voltage signal with amplitutes Vmin=-20V and Vmax=+20V. We want to use L=8 quantization levels.
Zone width D = (20 - -20)/8 = 5. The 8 zones are: -20 to -15, -15 to -10, -10 to -5, -5 to 0, 0 to +5, +5 to +10, +10 to
+15, +15 to +20. The midpoints are: -17.5, -12.5, -7.5, -2.5, 2.5, 7.5, 12.5, 17.5

##### Assigning Codes to Zones
Each zone is then assigned a binary code. The number of bits required to encode the zones, or the number of bits per sample as it is commonly referred to, is obtained as follows:
 - nb = log2 L. Given our example, nb = 3. The 8 zone (or level) codes are therefore: 000, 001, 010, 011, 100, 101, 110, and 111. Assigning codes to zones: – 000 will refer to zone -20 to -15 – 001 to zone -15 to -10, etc.
 - Assigning codes to zones: – 000 will refer to zone -20 to -15 – 001 to zone -15 to -10, etc.
 
 ![Not Found!](https://preview.ibb.co/dCzn0L/image.png)
 
 ##### Quantization Error
 When a signal is quantized, we introduce an error – the coded signal is an approximation of the actual amplitude value.
- The difference between actual and coded value (midpoint) is referred to as the quantization error.
- The more zones, the smaller Delta which results in smaller errors.
- BUT, the more zones the more bits required to encode the samples – higher bit rate

 ![Not Found!](https://preview.ibb.co/kGkALL/image.png)
 
 #### 2.Binary encoding
 
 ##### Steps for digitization/reconstruction of a signal
 
 ![Not Found!]( https://preview.ibb.co/dpAo70/image.png)
 
 ![Not Found!]( https://preview.ibb.co/cnbd70/image.png)
 
  ![Not Found!]( https://preview.ibb.co/hZOGS0/image.png)
 
 

