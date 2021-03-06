# DesignPattern
调停者模式和门面模式有相似之处。
他们都是用一个类来协调其他类的关系。
比如在一个坦克游戏中，有坦克、子弹、墙、爆炸等，他们之间都有联系而且联系特别复杂。当我们想再添加一个游戏物体进来的时候，又会和其他物体产生更复杂的联系。如果一直这样下去代码会越来越混乱。
这时可以用调停者或者门面。

门面（Facade）模式
当有一堆很复杂的关系时，对外调用会很麻烦。这时可以把内外关系封装起来，对外提供的接口封装到一个类里。由这一个类管理其他的类，对外提供一个统一的接口。这就是门面模式。
相当于一个客户，直接去访问门面，让门面去协调内部关系。

调停者（Mediator）模式
当各部门内部之间的关系也很复杂时，想添加一个新的部门进来，又要和其他部门打交道。这是我们可以抽出一个部分，让它和其他的部门打交道。这种模式叫调停者。
当各部门内部关系复杂时，使用调停者来协调内部关系。
应用：消息中间件
门面模式是对外协调，调停者模式使对内协调。